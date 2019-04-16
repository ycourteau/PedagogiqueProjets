<template>
    <Page class="page">
        <ActionBar title="Petits Poussins" class="action-bar">
            <ActionItem ios.position="right" android.position="right" icon="~/images/small.png"></ActionItem>

        </ActionBar>
        <StackLayout>
            <Button class="btn" text="Parent" @tap="goParent"></Button>
            <Button class="btn" text="Manager" @tap="goManager"></Button>
            <Button class="btn" text="Educateur(trice)" @tap="goEducateur"></Button>
        </StackLayout>

        </StackLayout>

    </Page>
</template>

<script>
    import managers from "./managers";
    import educ from "./educateurs";
    import parents from "./parents";

    export default {
        data() {
            return {};
        },
        methods: {
            goManager() {
                this.$navigateTo(managers);
            },
            goEducateur() {
                this.$navigateTo(educ);
            },
            goParent() {
                this.$navigateTo(parents);
            }
        }
    };
</script>

<style scoped>
    .btn {
        font-size: 30;
        color: white;
        margin-top: 50;
        width: 250;
        height: 60;
        background: rgb(233, 150, 122);
    }

    Page {
        background-image: url('~/images/garderie_back.jpg');
    }
</style>